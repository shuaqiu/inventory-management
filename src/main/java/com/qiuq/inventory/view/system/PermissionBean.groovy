/**
 *
 */
package com.qiuq.inventory.view.system

import org.primefaces.model.DefaultTreeNode
import org.primefaces.model.TreeNode
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

/**
 * @author qiushaohua 2012-9-11
 * @version 0.0.1
 *
 */
@Component
@Scope("request")
class PermissionBean {

    public static final Map P = [
        [id:100, name:"进货管理"] : [[id:"73",name:"进货单"],[id:"74",name:"进货退货单"],[id:"127",name:"单据中心"]],
        [id:101, name:"销售管理"] : [[id:"85",name:"零售单"],[id:"83",name:"批发销售单"],[id:"84",name:"批发退货单"]],
        [id:85, name:"零售单"] : [[id:"12",name:"挂单"],[id:"13",name:"取单"],[id:"14",name:"会员"],[id:"15",name:"数量"],[id:"16",name:"折扣"],[id:"21",name:"整单退货"],[id:"24",name:"会员会卡"],[id:"26",name:"快捷键设置"],[id:"23",name:"赠送"],[id:"30",name:"单品退货"]],
        [id:102, name:"库存管理"] : [[id:"91",name:"库存盘点单"],[id:"92",name:"库存报损单"],[id:"93",name:"库存报溢单"],[id:"96",name:"库存调拨"],[id:"220",name:"库存领料单"]],
        [id:103, name:"财务管理"] : [[id:"112",name:"收款单"],[id:"113",name:"付款单"],[id:"114",name:"其他收支单"],[id:"334",name:"前台交款单"]],
        [id:104, name:"报表管理"] : [[id:"121",name:"老板中心"],[id:"122",name:"进货统计"],[id:"123",name:"销售统计"],[id:"124",name:"库存统计"],[id:"126",name:"应收应付"],[id:"125",name:"资金统计"],[id:"137",name:"会员统计"]],
        [id:105, name:"基础资料"] : [[id:"42",name:"商品信息"],[id:"50",name:"供应商"],[id:"49",name:"客户信息"],[id:"180",name:"会员信息"],[id:"43",name:"仓库信息"],[id:"45",name:"员工信息"],[id:"53",name:"银行账户"],[id:"26",name:"其他资料"]],
        [id:106, name:"系统管理"] : [[id:"144",name:"系统设置"],[id:"143",name:"权限设置"],[id:"142",name:"数据管理"],[id:"145",name:"系统操作日志"],[id:"146",name:"期初库存"]],
        [id:3000, name:"特殊权限"] : [[id:"3001",name:"允许查看商品进货价"],[id:"3002",name:"销售成本调整"],[id:"3003",name:"允许抹零"],[id:"3004",name:"撤销该单据为草稿状态"]],
        ];

    TreeNode permissions;

    TreeNode[] selectedNodes;

    TreeNode getPermissions(){
        if(permissions == null){
            permissions = new DefaultTreeNode("Root", null);

            P.each {
                key, value ->
                TreeNode node = new DefaultTreeNode(key.name, permissions);

                value.each {
                    new DefaultTreeNode(it.name, node);
                }
            }
        }
        return permissions;
    }
}
