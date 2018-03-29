package id.yuana.cargallery_;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created on : March 29, 2018
 * Author     : yuana
 * GitHub     : https://github.com/andhikayuana
 */
public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private final List<Car> mCars;
    private CarAdapterListener mListener;

    public CarAdapter(List<Car> cars) {
        mCars = cars;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.item_car, parent, false);

        CarViewHolder carViewHolder = new CarViewHolder(view, mListener);

        return carViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {

        Car car = mCars.get(position);

        holder.showData(car);
    }


    @Override
    public int getItemCount() {
        return mCars.size();
    }

    public void setClickListener(CarAdapterListener listener) {
        mListener = listener;
    }
}
