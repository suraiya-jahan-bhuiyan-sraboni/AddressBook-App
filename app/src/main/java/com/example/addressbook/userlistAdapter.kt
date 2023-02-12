package com.example.addressbook

import android.app.AlertDialog.*
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView




class userlistAdapter(private val context:Context, private val dataset: List<User>):RecyclerView.Adapter<userlistAdapter.userViewHolder>() {

    class userViewHolder (view: View):RecyclerView.ViewHolder(view){
        val name:TextView=view.findViewById(R.id.name_textView)
        val number:TextView=view.findViewById(R.id.number_textView2)
        val profile:ImageView=view.findViewById(R.id.imageView)
        val details:Button=view.findViewById(R.id.DetailsButton)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userViewHolder {
       val root=LayoutInflater.from(parent.context).inflate(R.layout.userlist,parent,false)
        return userViewHolder(root)
    }

    override fun onBindViewHolder(holder: userViewHolder, position: Int) {
        val item= dataset[position]
        holder.profile.setImageResource(item.imageResourceId)
        holder.name.text=context.resources.getString(item.stringResourceId1)
        holder.number.text=context.resources.getString(item.stringResourceId2)
        holder.details.setOnClickListener{
            //Toast.makeText(context,"button clicked",Toast.LENGTH_SHORT).show()
            showDetailsDialog(item,holder.itemView.context)


        }
    }

    private fun showDetailsDialog(item: User, context: Context) {
        val dialogBuilder = Builder(context)
        val inflater = LayoutInflater.from(context)
        val dialogView = inflater.inflate(R.layout.alertdialog, null)
        dialogBuilder.setView(dialogView)
        val alertDialog = dialogBuilder.create()
        alertDialog.show()

        val userImage = dialogView.findViewById<ImageView>(R.id.imageView2)
        val userName = dialogView.findViewById<TextView>(R.id.textView)
        val userPhoneNumber = dialogView.findViewById<TextView>(R.id.textView2)
        val villageName = dialogView.findViewById<TextView>(R.id.textView3)
        val postOfficeName = dialogView.findViewById<TextView>(R.id.textView4)
        val districtName = dialogView.findViewById<TextView>(R.id.textView5)
        val divisionName = dialogView.findViewById<TextView>(R.id.textView6)
        val countryName = dialogView.findViewById<TextView>(R.id.textView7)
        val closeCancelBtn = dialogView.findViewById<Button>(R.id.button)
        userImage.setImageResource(item.imageResourceId)
        userName.text = context.resources.getString(item.stringResourceId1)
        userPhoneNumber.text = context.resources.getString(item.stringResourceId2)
        villageName.text = context.resources.getString(item.villageName)
        postOfficeName.text = context.resources.getString(item.postOfficeName)
        districtName.text = context.resources.getString(item.districtName)
        divisionName.text = context.resources.getString(item.divisionName)
        countryName.text = context.resources.getString(item.countryName)
        closeCancelBtn.setOnClickListener(){
            alertDialog.dismiss()
        }
    }

    override fun getItemCount(): Int {
       return dataset.size
    }

}

data class User(
    val imageResourceId: Int,
    val stringResourceId1: Int,
    val stringResourceId2: Int,
    val villageName: Int,
    val postOfficeName: Int,
    val districtName: Int,
    val divisionName: Int,
    val countryName: Int
)