package id.yuana.cargallery_;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements CarAdapterListener {

    private RecyclerView rvMainCar;
    private CarAdapter carAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initAdapter();
    }

    private void initView() {
        rvMainCar = findViewById(R.id.rvMainCar);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        rvMainCar.setLayoutManager(linearLayoutManager);
    }

    private void initAdapter() {
        List<Car> data = Car.generateData();
        carAdapter = new CarAdapter(data);
        carAdapter.setClickListener(this);
        rvMainCar.setAdapter(carAdapter);
    }

    @Override
    public void onItemClick(Car car) {
        Toast.makeText(this, car.toString(),
                Toast.LENGTH_SHORT).show();
    }
}
