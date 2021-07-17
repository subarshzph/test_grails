package spring

import com.demo.dao.HomeDao

// Place your Spring DSL code here
beans = {
    mainDataSourceTemplate(org.springframework.jdbc.core.JdbcTemplate) {
        dataSource = ref('dataSource')
    }

    homeDao(HomeDao)
}
