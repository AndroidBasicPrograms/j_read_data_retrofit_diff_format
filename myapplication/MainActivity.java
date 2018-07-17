
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.appsb.myapplication.adapter.rAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements rAdapter.UserClickListener {
    RecyclerView rv;
    apiService apiService ;
    ArrayList<rModel> al;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        rv=findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(context));
        apiService=apiClient.getClient().create(apiService.class);
        Call <List<rResponse>> call=apiService.getData();
        call.enqueue(new Callback<List<rResponse>>() {
            @Override
            public void onResponse(Call<List<rResponse>> call, Response<List<rResponse>> result) {
              List<rResponse> rs =result.body();
              rResponse r=rs.get(0);
              String status=r.getStatus();
              Log.d("TAG",status);
              if(status.equals("Success")) {
                  ArrayList<rModel> model = (ArrayList<rModel>) r.getRestaurant_list();
                  rModel m=model.get(0);
                  String image=m.getImage();
                  Log.d("TAG", image);
                  rv.setAdapter(new rAdapter(model,MainActivity.this));
              }
            }

            @Override
            public void onFailure(Call<List<rResponse>> call, Throwable t) {
                Log.d("TAG", "noo");
            }
        });

    }

    @Override
    public void onUserClick(rModel rm) {

    }
}
