package id.yuana.cargallery_;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created on : March 29, 2018
 * Author     : yuana
 * GitHub     : https://github.com/andhikayuana
 */
public class CarViewHolder extends RecyclerView.ViewHolder {

    private final CarAdapterListener mListener;
    private TextView tvId;
    private TextView tvMake;
    private TextView tvModel;
    private TextView tvYear;
    private LinearLayout llItemCar;

    public CarViewHolder(View itemView, CarAdapterListener listener) {
        super(itemView);
        mListener = listener;
        initView(itemView);
    }

    private void initView(View view) {
        tvId = view.findViewById(R.id.tvId);
        tvMake = view.findViewById(R.id.tvMake);
        tvModel = view.findViewById(R.id.tvModel);
        tvYear = view.findViewById(R.id.tvYear);
        llItemCar = view.findViewById(R.id.llItemCar);
    }

    public void showData(final Car car) {
        tvId.setText(String.valueOf(car.getId()));
        tvYear.setText(String.valueOf(car.getYear()));
        tvMake.setText(car.getMake());
        tvModel.setText(car.getModel());

        llItemCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onItemClick(car);
            }
        });

    }
}
