package com.example.homework_4_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Car
    List<Car> cars = new ArrayList<Car>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        CarAdapter adapter = new CarAdapter(this, cars);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        cars.add( new Car("ВАЗ-2101", "Мощность: 64 л. с.",
                R.drawable.vaz1, "Годы производства: 1970-1988"));
        cars.add( new Car("ВАЗ-2102", "Мощность: 64 л. с.",
                R.drawable.vaz2, "Годы производства: 1971-1986"));
        cars.add( new Car("ВАЗ-2107", "Мощность: 64-80 л. с.",
                R.drawable.vaz3, "Годы производства: 1982-2014"));
        cars.add( new Car("ВАЗ-2108", "Мощность: 54-140 л. с.",
                R.drawable.vaz4, "Годы производства: 1984-2014"));
        cars.add( new Car("ВАЗ-2101", "Мощность: 54-77 л. с.",
                R.drawable.vaz5, "Годы производства: 1987-2011"));
    }
}