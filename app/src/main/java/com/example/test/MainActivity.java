package com.example.test;




import static com.example.test.ConstantValues.BASE_URL;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private ImageView imageView;
    private TextView productDes, productPrice,ProductDis;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.image);

        productDes = findViewById(R.id.productDes);
        productPrice = findViewById(R.id.productPrice);
        ProductDis = findViewById(R.id.ProductDis);



        ApiService apiService = RetrofitClient.getClient(BASE_URL)
                .create(ApiService.class);


        apiService.getProductDetails()
                .enqueue(new Callback<ProductDetails>() {
                    @Override
                    public void onResponse(Call<ProductDetails> call, Response<ProductDetails> response) {
                        if(response.isSuccessful()){
                            ProductDetails productDetails = response.body();
                            productDes.setText(productDetails.getProductName());
                            productPrice.setText(productDetails.getProductPrice());
                            ProductDis.setText(productDetails.getDiscountCharge().toString());
                            Picasso.get().load(productDetails.getImage()).into(imageView);



                        }else{
                            Toast.makeText(MainActivity.this, "Api key experied ", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ProductDetails> call, Throwable throwable) {

                    }
                });



    }










}
