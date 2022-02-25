package com.kehao.blog.dao;

import com.kehao.blog.po.Blog;
import com.kehao.blog.service.BlogService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {

}
