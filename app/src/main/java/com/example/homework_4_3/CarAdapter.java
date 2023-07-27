package com.example.homework_4_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Car> cars; // поле коллекции контейнера для хранения данных (объектов класса Car)

    // конструктор адаптера
    public CarAdapter(Context context, List<Car> animals) {
        this.inflater = LayoutInflater.from(context);
        this.cars = animals;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Car
    @Override
    public CarAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Car по определенной позиции
    @Override
    public void onBindViewHolder(CarAdapter.ViewHolder holder, int position) {
        Car car = cars.get(position);
        holder.carView.setImageResource(car.getCarResource());
        holder.nameView.setText(car.getName());
        holder.carPowerView.setText(car.getCarPower());
        holder.carPeriodView.setText(car.getCarPeriod());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return cars.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView carView;
        final TextView nameView, carPowerView, carPeriodView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            carView = view.findViewById(R.id.carResource);
            nameView = view.findViewById(R.id.name);
            carPowerView = view.findViewById(R.id.carPower);
            carPeriodView = view.findViewById(R.id.carPeriod);
        }
    }
}
