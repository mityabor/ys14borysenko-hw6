package ua.kiev.shad.it;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mitya
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/annotationConfigChild.xml"},
        inheritLocations = true)
//@ContextConfiguration(locations = {"annotaionConfigChild.xml"},
//        inheritLocations = true)
public abstract class ExtendedConfig extends BasicConfig {
    
}
