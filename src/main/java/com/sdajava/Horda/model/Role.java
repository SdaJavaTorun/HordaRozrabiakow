//package com.sdajava.Horda.model;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name="roles")
//public class Role {
//    private Long id;
//    private String name;
//    private Set<User> users;
//
//    public Role(){
//    }
//
//    public Role(String name){
//        this.name = name;
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    public Long getId(){
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @OneToMany(mappedBy = "roles")
//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
//
//    @Override
//    public String toString() {
//        return "Role{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
