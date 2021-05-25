package com.example.turbocare.Model

class VehilcesListModel:ArrayList<VehiclesListModelItem>()

data class VehiclesListModelItem(
    val vehicleNumber:String,
    val vehicleMake:String,
    val vehicleModel:String,
    val vehicleTransmission:String,
    val vehFuelType:String,
    val veh_type:String
)