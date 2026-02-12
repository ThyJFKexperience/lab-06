package com.example.listycity;

/**
 * This is a class that defines a city
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * A getter method that returns the name of the city
     * @return
     *      The String name of the city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * A getter method that returns the province name of this city
     * @return
     *      The String name of the province
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This is the overwitten method that is used to compare cities alphabetically based on their name
     * @param o
     *      Another city to which you want to conduct a comparison
     * @return
     *      integer representing the result of the comparison
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}
