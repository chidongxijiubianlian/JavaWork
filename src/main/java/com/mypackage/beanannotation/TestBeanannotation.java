package com.mypackage.beanannotation;

import com.mypackage.bean.JdbcDriverManager;
import com.mypackage.bean.TestInitDestory;
import com.mypackage.config.myJdbcConfig;
import com.mypackage.config.myStoreConfig;
import com.mypackage.service.JsrService;
import com.mypackage.SummerApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class TestBeanannotation {
    @Autowired
    private List<IBeanInterface> iBeanInterfaceList;
    @Autowired
    private Map<String,IBeanInterface> myMap;
    @Autowired
    private Set<IBeanInterface> mySet;
    @Autowired
    @Qualifier("beanImplC")
    private IBeanInterface iBeanInterface;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private  TestInitDestory show;
    @Autowired
    private JdbcDriverManager jdbcDriverManager;
    @Autowired
    private myJdbcConfig myJdbcConfig;
    @Autowired
    private myStoreConfig myStoreConfig;
    @Autowired
    private IStore<String> iStoreA;
    @Autowired
    private IStore<Integer> iStoreB;
    @Autowired
    private JsrService jsrService;
    public void show()
    {
//        if(iBeanInterfaceList !=null && iBeanInterfaceList.size() >0)
//        {
//            for(IBeanInterface bean:iBeanInterfaceList)
//            {
//                System.out.println(bean.getClass().getName());
//                bean.show();
//            }
//        }else{
//            System.out.println("List is null");
//        }
//        if(myMap !=null && myMap.size() >0)
//        {
//            for(Map.Entry<String,IBeanInterface> oMap:myMap.entrySet())
//            {
//                System.out.println(oMap.getKey()+oMap.getValue().getClass());
//                oMap.getValue().show();
//            }
//        }else{
//            System.out.println("Map is null");
//        }
//        if(mySet !=null && mySet.size() >0)
//        {
//            for(IBeanInterface item:mySet)
//            {
//                System.out.println(item.getClass().getName());
//                item.show();
//            }
//        }
//        if(iBeanInterface !=null)
//        {
//            System.out.println(iBeanInterface.getClass().getName());
//            iBeanInterface.show();
//        }
//        TestInitDestory testInitDestory =(TestInitDestory)applicationContext.getBean("show");
//        testInitDestory.show();
//        show.show();
//        jdbcDriverManager.show();
//        System.out.println(myJdbcConfig.password);
        System.out.println("proAddr:"+myStoreConfig.proAddr+"proName:"+myStoreConfig.proName+"proCount"+myStoreConfig.proCount);
        iStoreA.show();
        iStoreB.show();
        jsrService.save();
        jsrService.start();
        jsrService.end();
        SummerApplicationContext context = new SummerApplicationContext();
        context.SummerStart();
        JdbcDriverManager jdbcDriverManager =(JdbcDriverManager)context.GetTaste("jdbcDriverManager");
        jdbcDriverManager.show();
    }
}
