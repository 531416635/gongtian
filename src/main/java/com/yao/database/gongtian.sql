/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : gongtian

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2017-09-20 07:14:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `gongtian`
-- ----------------------------
DROP TABLE IF EXISTS `gongtian`;
CREATE TABLE `gongtian` (
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `riqi` date DEFAULT NULL COMMENT '日期',
  `xqmc` varchar(20) DEFAULT NULL COMMENT '小区名称',
  `lh` varchar(20) DEFAULT NULL COMMENT '楼号',
  `zxgs` varchar(20) DEFAULT NULL COMMENT '楼号',
  `lxr` varchar(20) DEFAULT NULL COMMENT '联系人名字',
  `phone` bigint(12) DEFAULT NULL COMMENT '手机号码',
  `yc` varchar(50) DEFAULT NULL COMMENT '用材',
  `sl` int(8) DEFAULT NULL COMMENT '数量',
  `jg` double(10,2) DEFAULT NULL COMMENT '价格',
  `bz` varchar(100) DEFAULT NULL COMMENT '备注',
  `sfyf` int(8) DEFAULT NULL COMMENT '工钱是否已付',
  `tjsj` date DEFAULT NULL COMMENT '添加时间',
  `param` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gongtian
-- ----------------------------
