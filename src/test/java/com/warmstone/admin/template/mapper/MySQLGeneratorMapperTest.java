package com.warmstone.admin.template.mapper;

import com.warmstone.admin.template.entity.Column;
import com.warmstone.admin.template.entity.Table;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MySQLGeneratorMapperTest {

    @Resource
    private MySQLGeneratorMapper mySQLGeneratorMapper;

    @Test
    public void testQueryList() {
        List<Table> tables = mySQLGeneratorMapper.queryList(null);
    }

    @Test
    public void testQueryTable() {
        Table sysUser = mySQLGeneratorMapper.queryTable("sys_user");
    }

    @Test
    public void testQueryColumns() {
        List<Column> sysUserColumn = mySQLGeneratorMapper.queryColumns("sys_user");
    }

}
