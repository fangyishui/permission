package com.jpa.permission.role;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.jpa.permission.user.User;

import lombok.Data;
 /**
 * 项目名称:	[ LaborDAL ]
 * 包:			[ com.cjb.job.labor.permission ]    
 * 类名称:		[ Role ]  
 * 类描述:		[ 一句话描述该类的功能 ]
 * 创建人:		[ gyz ]   
 * 创建时间:	[ 2019-4-1 上午9:24:27 ]   
 * 修改人:		[ gyz ]   
 * 修改时间:	[ 2019-4-1 上午9:24:27 ]   
 * 修改备注:	[ 说明本次修改内容 ]  
 * 版本:		[ v1.0 ]     
 */
@Entity
@Table(name="ROLE")
@Data
public class Role{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String roleName;
	
	private String url;
	
	@ManyToMany(mappedBy="roles")
	private Set<User> users = new HashSet<>();

}
