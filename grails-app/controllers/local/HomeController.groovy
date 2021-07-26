package local

import com.demo.dao.IHome
import grails.converters.JSON
import org.grails.web.json.JSONArray
import org.grails.web.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired

class HomeController {
    @Autowired
    IHome iHome

    def index() {
        def test_data = JSON.parse(iHome.findName())

        JSONObject root_json = new JSONObject()
        JSONArray json_array = new JSONArray()

        root_json.put("data", json_array)

        println test_data: test_data

        render(view: 'index', model: [test_data: test_data])
    }
}
