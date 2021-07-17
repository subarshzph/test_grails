package local

import com.demo.dao.IHome
import grails.converters.JSON
import org.springframework.beans.factory.annotation.Autowired

class HomeController {
    @Autowired
    IHome iHome

    def index() {
        def test_data = JSON.parse(iHome.findName())
        println test_data: test_data

        render(view: 'index', model: [test_data: test_data])
    }
}
