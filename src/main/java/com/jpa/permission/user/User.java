package com.jpa.permission.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.jpa.permission.role.Role;

import lombok.Data;
 /**
 * 项目名称:	[ LaborDAL ]
 * 包:			[ com.cjb.job.labor.permission ]    
 * 类名称:		[ User ]  
 * 类描述:		[ 一句话描述该类的功能 ]
 * 创建人:		[ gyz ]   
 * 创建时间:	[ 2019-4-1 上午9:24:17 ]   
 * 修改人:		[ gyz ]   
 * 修改时间:	[ 2019-4-1 上午9:24:17 ]   
 * 修改备注:	[ 说明本次修改内容 ]  
 * 版本:		[ v1.0 ]     
 */
@Entity
@Table(name="USER")
@Data
public class User{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String userName;
	
	private String email;
	
	private String pwd;
	
	@ManyToMany(cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinTable(name="USER_ROLE",joinColumns={
			@JoinColumn(name="USER_ID",referencedColumnName="ID")}
			,inverseJoinColumns={@JoinColumn(name="ROLE_ID",referencedColumnName="ID")})
	private Set<Role> roles = new HashSet<>();

}
