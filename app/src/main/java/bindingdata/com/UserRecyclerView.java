package bindingdata.com;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import bindingdata.com.databinding.UserRowBinding;

public class UserRecyclerView  extends RecyclerView.Adapter<UserRecyclerView.UserViewHolder> {

    List<User> userList;

    public UserRecyclerView(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        UserRowBinding userRowBinding = UserRowBinding.inflate(layoutInflater,parent,false);

        return new UserViewHolder(userRowBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user =userList.get(position);
        holder.userRowBinding.setUser(user);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        UserRowBinding userRowBinding;
        public UserViewHolder(@NonNull UserRowBinding userRowBinding) {
            super(userRowBinding.getRoot());
            this.userRowBinding =userRowBinding;

        }
    }
}
