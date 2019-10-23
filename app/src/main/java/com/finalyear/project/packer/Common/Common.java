package com.finalyear.project.packer.Common;

import android.location.Location;

import com.finalyear.project.packer.Model.User;
import com.finalyear.project.packer.Remote.FCMClient;
import com.finalyear.project.packer.Remote.IFCMService;
import com.finalyear.project.packer.Remote.IGoogleAPI;
import com.finalyear.project.packer.Remote.RetrofitClient;

public class Common {

    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";
    public static final String register_current_order = "CurrentOrder";
    public static final String order_table = "Orders";

    public static final int PICK_IMAGE_REQUEST = 9999;
    public static final int PICK_PIMAGE_REQUEST = 9998;
    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";
    public static final String user_field = "rider_usr";
    public static final String pwd_field = "rider_pwd";
    public static User currentUser = new User();
    public static boolean acceptance = false;
    public static boolean ordering = false;
    public static String passengerID = "";
    public static String orderID = "";
    public static Location mLastLocation = null;
    public static Location mFirstLocation = null;
    public static double base_fare = 3.5;
    public static String current_orerder_state = "r";
    private static double time_rate = 0.15;
    private static double distance_rate = 0.73;

    public static double formulaPrice(double km, double min) {
        return base_fare + (distance_rate * km) + (time_rate * min);
    }

    public static IGoogleAPI getGoogleAPI() {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

    public static IFCMService getFCMService() {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
