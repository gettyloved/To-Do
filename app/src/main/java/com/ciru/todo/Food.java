package com.ciru.todo;

class Food {
    private String Food;
    private String FoodDes;
    private int FoodId;

    public static final Food[] food = {
            new Food("Chicken", "This is chicken", R.drawable.beans),
            new Food("beaf", "this is beaf", R.drawable.cream),
            new Food("chips", "this is chips", R.drawable.cap),
    };

    public Food(String food, String foodDes, int foodId) {
        Food = food;
        FoodDes = foodDes;
        FoodId = foodId;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }

    public String getFoodDes() {
        return FoodDes;
    }

    public void setFoodDes(String foodDes) {
        FoodDes = foodDes;
    }

    public int getFoodId() {
        return FoodId;
    }

    public void setFoodId(int foodId) {
        FoodId = foodId;
    }
}
