package csxt.zwk.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import csxt.entity.SupplierApproval;
import csxt.entity.SupplierApprovalDetails;
import csxt.zwk.dao.ApplyForApprovalMapper;
import csxt.zwk.service.ApplyForApprovalService;
import csxt.zwk.vo.ApplicationApprovalDto;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author mr.z
 * @date 2020/6/1 - 12:02
 */
@Service
public class ApplyForApprovalServiceImpl implements ApplyForApprovalService {

    @Autowired
    private ApplyForApprovalMapper applyForApprovalMapper;


    @Override
    public int insert(Object entity) {
        return 0;
    }

    @Override
    public int deleteById(Serializable id) {
        return 0;
    }

    @Override
    public int delete(Wrapper wrapper) {
        return 0;
    }

    @Override
    public int updateById(Object entity) {
        return 0;
    }

    @Override
    public int update(Object entity, Wrapper updateWrapper) {
        return 0;
    }

    @Override
    public Object selectById(Serializable id) {
        return null;
    }

    @Override
    public Object selectOne(Wrapper queryWrapper) {
        return null;
    }

    @Override
    public int deleteBatchIds(Collection idList) {
        return 0;
    }

    @Override
    public int deleteByMap(Map columnMap) {
        return 0;
    }

    @Override
    public Integer selectCount(Wrapper queryWrapper) {
        return null;
    }

    @Override
    public List selectList(Wrapper queryWrapper) {

        return applyForApprovalMapper.selectList(null);
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper queryWrapper) {
        return null;
    }

    @Override
    public List<Object> selectObjs(Wrapper queryWrapper) {
        return null;
    }

    @Override
    public IPage selectPage(IPage page, Wrapper queryWrapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> selectMapsPage(IPage page, Wrapper queryWrapper) {
        return null;
    }


    @Override
    public List selectByMap(Map columnMap) {
        return null;
    }

    @Override
    public List selectBatchIds(Collection idList) {
        return null;
    }


    @Override
    public List<Map<String, Object>> queryAllByLimit(int offset, int limit) {
        return applyForApprovalMapper.queryAllByLimit(offset, limit);
    }

    @Override
    public PageInfo<Map<String, Object>> getAll(Integer currNo, Integer pageSize) {
        //分頁查詢mr.z
        PageHelper.startPage(currNo,pageSize);
        PageInfo pageInfo=new PageInfo(this.applyForApprovalMapper.findMaterials());
        return pageInfo;
    }

    @Override
    public List<Map<String, Object>> findMaterials() {
        return applyForApprovalMapper.findMaterials();
    }

    @Override
    @Transactional//添加事务
    public int insertSupplierApproval(ApplicationApprovalDto applicationApprovalDto) {
        //添加供应商申请审批
         applicationApprovalDto.getSupplierApproval().setRegisterTime(new Date());
         SimpleDateFormat a=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         Date date=new Date();
         a.format(applicationApprovalDto.getSupplierApproval().getSupplierTime());
        //添加供应商申请
         int result = applyForApprovalMapper.insertSupplierApproval(applicationApprovalDto.getSupplierApproval());
        //添加供应商明细
        SupplierApprovalDetails supplierApprovalDetails = new SupplierApprovalDetails();
        for (Map<String, Object> map : applicationApprovalDto.getSupplierApprovalDetailsList()) {
            //申请管理编号
            supplierApprovalDetails.setApprovalId(applicationApprovalDto.getSupplierApproval().getId());
            //产品编号
            supplierApprovalDetails.setProductId((String) map.get("product_id"));
            //产品名称
            supplierApprovalDetails.setProductName((String) map.get("product_name"));
            //描述
            supplierApprovalDetails.setProductDescribe("HHHH");
            //数量
            if (map.get("amount") == "" || map.get("amount") == null) {
                supplierApprovalDetails.setAmount(0);
            } else {
                supplierApprovalDetails.setAmount(Integer.parseInt(map.get("amount").toString()));
            }
            //单位
            supplierApprovalDetails.setUnit((String) map.get("amount_unit"));
            //单价
            supplierApprovalDetails.setPrice(Integer.parseInt(map.get("list_price").toString()));
            //小计
            if (map.get("subtotal") == "" || map.get("subtotal") == null) {
                supplierApprovalDetails.setSubtotal(0.0);
            } else {
                supplierApprovalDetails.setSubtotal(Double.parseDouble(map.get("subtotal").toString()));
            }
            //折扣
            if (map.get("discount") == "" || map.get("discount") == null) {
                supplierApprovalDetails.setDiscount(0);
            } else {
                supplierApprovalDetails.setDiscount(Integer.parseInt(map.get("discount").toString()));
            }
            //添加申請明顯
            applyForApprovalMapper.insertSupplierApprovalDetails(supplierApprovalDetails);
        }
        return result;
    }

    @Override
    public List<SupplierApproval> findNoAuditSupplierApproval(SupplierApproval supplierApproval) {
        return applyForApprovalMapper.findNoAuditSupplierApproval(supplierApproval);
    }

    @Override
    public List<SupplierApprovalDetails> findSupplierApprovalDetails(Integer approvalId) {
        return applyForApprovalMapper.findSupplierApprovalDetails(approvalId);
    }

    @Override
    @Transactional//添加事务
    public int AuditSupplierApproval(ApplicationApprovalDto approvalDto) {
        //審核申請
       int result= applyForApprovalMapper.AuditSupplierApproval(approvalDto.getSupplierApproval());
        //申请明细
        SupplierApprovalDetails supplierApprovalDetails = new SupplierApprovalDetails();
        for (Map<String, Object> map : approvalDto.getSupplierApprovalDetailsList()) {
            //申请管理编号
            supplierApprovalDetails.setApprovalId(approvalDto.getSupplierApproval().getId());
            //产品编号
            supplierApprovalDetails.setProductId((String) map.get("product_id"));
            //产品名称
            supplierApprovalDetails.setProductName((String) map.get("product_name"));
            //描述
            supplierApprovalDetails.setProductDescribe((String) map.get("comment"));
            //数量
            if (map.get("amount") == "" || map.get("amount") == null) {
                supplierApprovalDetails.setAmount(0);
            } else {
                supplierApprovalDetails.setAmount(Integer.parseInt(map.get("amount").toString()));
            }
            //单位
            supplierApprovalDetails.setUnit((String) map.get("amount_unit"));
            //单价
            supplierApprovalDetails.setPrice(Integer.parseInt(map.get("price").toString()));
            //小计
            if (map.get("subtotal") == "" || map.get("subtotal") == null) {
                supplierApprovalDetails.setSubtotal(0.0);
            } else {
                supplierApprovalDetails.setSubtotal(Double.parseDouble(map.get("subtotal").toString()));
            }
            //折扣
            if (map.get("discount") == "" || map.get("discount") == null) {
                supplierApprovalDetails.setDiscount(0);
            } else {
                supplierApprovalDetails.setDiscount(Integer.parseInt(map.get("discount").toString()));
            }
            //審核神奇明細
            applyForApprovalMapper.AuditSupplierApprovalDetails(supplierApprovalDetails);
        }
        //審核申請
        return result;
    }

    @Override
    public List<SupplierApproval> findAudited(SupplierApproval supplierApproval) {
        return applyForApprovalMapper.findAudited(supplierApproval);
    }

}
