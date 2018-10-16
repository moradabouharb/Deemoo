package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {

    @Autowired
    private JdbcTemplate jtm;

    @Override
    public List<City> findAll() {

        String sql = "SELECT * FROM CITIES";

        List<City> cities = jtm.query(sql, new BeanPropertyRowMapper(City.class));

        return cities;
    }

    @Override
    public City findById(Long id) {

        String sql = "SELECT * FROM CITIES WHERE ID=?";

        City city = (City) jtm.queryForObject(sql, new Object[]{id},
                new BeanPropertyRowMapper(City.class));

        return city;
    }
}
