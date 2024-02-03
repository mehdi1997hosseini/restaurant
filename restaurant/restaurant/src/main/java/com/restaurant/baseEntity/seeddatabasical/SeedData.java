package com.restaurant.baseEntity.seeddatabasical;

import com.restaurant.baseEntity.city.CityEntity;
import com.restaurant.baseEntity.city.CityService;
import com.restaurant.baseEntity.color.ColorEntity;
import com.restaurant.baseEntity.color.ColorService;
import com.restaurant.baseEntity.country.CountryEntity;
import com.restaurant.baseEntity.country.CountryService;
import com.restaurant.baseEntity.menuservice.MenuServiceEntity;
import com.restaurant.baseEntity.menuservice.MenuServiceService;
import com.restaurant.baseEntity.province.ProvinceEntity;
import com.restaurant.baseEntity.province.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SeedData implements ApplicationRunner {
    private final CountryService countryService;
    private final ColorService colorService;
    private final CityService cityService;
    private final ProvinceService provinceService;
    private final MenuServiceService menuServiceService;

    @Autowired
    public SeedData(CountryService countryService, ColorService colorService, CityService cityService,
                    ProvinceService provinceService, MenuServiceService menuServiceService) {
        this.countryService = countryService;
        this.colorService = colorService;
        this.cityService = cityService;
        this.provinceService = provinceService;
        this.menuServiceService = menuServiceService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<CountryEntity> listCountry = countryService.findAll();
        List<ColorEntity> listColor = colorService.findAll();
        List<CityEntity> listCity = cityService.findAll();
        List<MenuServiceEntity> listMenu = menuServiceService.findAll();
        List<CountryEntity> countryEntities = new ArrayList<>();

        if (listCountry == null || listCountry.isEmpty()) {

            CountryEntity countryIran = new CountryEntity();
            countryIran.setCountryName("ایران");
            countryEntities.add(countryIran);

            CountryEntity countryAmerican = new CountryEntity();
            countryAmerican.setCountryName("امریکا");
            countryEntities.add(countryAmerican);

            CountryEntity countryChina = new CountryEntity();
            countryChina.setCountryName("چین");
            countryEntities.add(countryChina);

            for (CountryEntity country:countryEntities) {
                countryService.saveOrUpdate(country);
            }
        }else {
            countryEntities=listCountry;
        }

        if (listColor == null || listColor.isEmpty()) {
            List<ColorEntity> colorEntities = new ArrayList<>();

            ColorEntity colorBlue = new ColorEntity();
            colorBlue.setColorName("آبی");
            colorEntities.add(colorBlue);

            ColorEntity colorRed = new ColorEntity();
            colorRed.setColorName("قرمز");
            colorEntities.add(colorRed);

            ColorEntity colorGreen = new ColorEntity();
            colorGreen.setColorName("سبز");
            colorEntities.add(colorGreen);
            for (ColorEntity color : colorEntities) {
                colorService.saveOrUpdate(color);
            }
        }

        if (listCity == null || listCity.isEmpty()) {
            List<CityEntity> cityEntities = new ArrayList<>();

            ProvinceEntity provinceGol = new ProvinceEntity();
            provinceGol.setProvinceName("گلستان");
            provinceGol.setCountry(countryEntities.get(0));
            ProvinceEntity newProvinceGol = provinceService.saveOrUpdate(provinceGol);

            CityEntity cityGon = new CityEntity();
            cityGon.setCityName("گنبد کاووس");
            cityGon.setProvince(newProvinceGol);
            cityEntities.add(cityGon);
            cityService.saveOrUpdate(cityGon);

            CityEntity cityGor = new CityEntity();
            cityGor.setCityName("گرگان");
            cityGor.setProvince(newProvinceGol);
            cityEntities.add(cityGor);

            ProvinceEntity provinceTeh = new ProvinceEntity();
            provinceTeh.setProvinceName("تهران");
            provinceTeh.setCountry(countryEntities.get(0));
            ProvinceEntity newProvinceTeh = provinceService.saveOrUpdate(provinceTeh);

            CityEntity cityTeh = new CityEntity();
            cityTeh.setCityName("تهران");
            cityTeh.setProvince(newProvinceTeh);
            cityEntities.add(cityTeh);

            for (CityEntity cityEntity:cityEntities) {
                cityService.saveOrUpdate(cityEntity);
            }
        }

        if(listMenu==null || listMenu.isEmpty()){

            MenuServiceEntity menuHome = new MenuServiceEntity();
            menuHome.setTitle("home");
            menuHome.setIsActive(true);
            menuServiceService.saveOrUpdate(menuHome);

            MenuServiceEntity menuContent = new MenuServiceEntity();
            menuContent.setTitle("content");
            menuContent.setIsActive(true);
            menuServiceService.saveOrUpdate(menuContent);


            MenuServiceEntity menuSession = new MenuServiceEntity();
            menuSession.setTitle("session");
            menuSession.setIsActive(true);
            menuSession = menuServiceService.saveOrUpdate(menuSession);

            MenuServiceEntity menuSessionHtml = new MenuServiceEntity();
            menuSessionHtml.setTitle("html");
            menuSessionHtml.setIsActive(true);
            menuSessionHtml.setMenu(menuSession);
            menuServiceService.saveOrUpdate(menuSessionHtml);

            MenuServiceEntity menuSessionCss = new MenuServiceEntity();
            menuSessionCss.setTitle("css");
            menuSessionCss.setIsActive(true);
            menuSessionCss.setMenu(menuSession);
            menuServiceService.saveOrUpdate(menuSessionCss);

        }

    }


}
