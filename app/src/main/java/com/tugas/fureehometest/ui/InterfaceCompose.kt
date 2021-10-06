package com.tugas.fureehometest.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tugas.fureehometest.R
import com.tugas.fureehometest.data.PaymentMethod
import com.tugas.fureehometest.data.paymentMethod
import com.tugas.fureehometest.ui.theme.*

@ExperimentalFoundationApi
@Composable
fun AppointmentScreen() {
    LazyColumn (modifier = Modifier
        .background(whiteGrey)
        .fillMaxSize()
    ){
        stickyHeader{
            StatusSegment(status = "Appointment")
        }
        item {
            AppointedSegment()
        }
        item {
            CostSegment()
        }
        item {
            PaymentSegment()
        }
        item {
            ConfirmButton()
        }
    }
}

@Composable
fun StatusSegment(status : String) {
    val (isChecked,setChecked) = remember {
        mutableStateOf(false)
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        IconImage(
            imageNotActived = R.drawable.ic_menu,
            imageActived =R.drawable.ic_menu,
            desc = "menu",
            isChecked = isChecked,
            onItemClick = {setChecked(!isChecked)}
        )
        Text(text = status,
            style = MaterialTheme.typography.h1
            )
        IconImage(
            imageNotActived = R.drawable.ic_notification,
            desc = "notifikasi",
            onItemClick = {setChecked(!isChecked)},
            imageActived = R.drawable.ic_notification_active,
            isChecked =isChecked
        )
    }
}

@Composable
fun IconImage(
    imageActived : Int,
    imageNotActived : Int,
    desc : String,
    isChecked : Boolean,
    onItemClick:() -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(4.dp))
            .background(Color.White)
            .clickable { onItemClick() }
            .padding(10.dp)
    ){
        Icon(
            painter = if (isChecked) painterResource(id = imageActived)
            else painterResource(id = imageNotActived),
            contentDescription = desc,
            modifier = Modifier
                .size(20.dp)
        )
    }
}

@Composable
fun AppointedSegment() {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 10.dp)
            .clip(RoundedCornerShape(15.dp))
            .fillMaxWidth()
            .background(darkBlue)
            .padding(10.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.dokter),
            contentDescription = "dokter",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
        Column (modifier = Modifier.padding(horizontal = 15.dp)) {
            Text(
                text = "Dr.Corrie Anderson",
                color = textWhite,
                style = MaterialTheme.typography.body1
            )
            Text(text = "Cardiovascular",
                color = textDarkBlue,
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "01 Hour Consultation",
                color = textWhite,
                style = MaterialTheme.typography.body1
            )
        }
    }
}

@Composable
fun CostSegment() {
    Box(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 10.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(color = Color.White)
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Box {
                    Column {
                        Text(text = "Appointment Cost",
                            style= MaterialTheme.typography.body1)
                        Text(text = "Consultation Fee for 01 hour",
                            style= MaterialTheme.typography.body2)
                    }
                }
                Text(text = "$95.00",
                    style= MaterialTheme.typography.body1)
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Text(text = "Admin Fee",
                    style= MaterialTheme.typography.body1)
                Text(text = "$05.00",
                    style= MaterialTheme.typography.body1)
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Text(text = "To Pay",
                    style= MaterialTheme.typography.body1)
                Text(text = "$100.00",
                    style= MaterialTheme.typography.body1)
            }
            Divider(
                color = Color.LightGray,
                thickness = 1.dp
            )
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = cream),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .clip(RoundedCornerShape(50.dp))
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_tag),
                        contentDescription = "discount",
                        tint = orange1,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(text = "Use Promo Code",
                        style= MaterialTheme.typography.button,
                        color = textDarkBlue
                    )
                    Icon(painter = painterResource(id = R.drawable.ic_arrow_right),
                        contentDescription = "Next",
                        tint = orange1,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}


@Composable
fun PaymentSegment() {
    Box(modifier = Modifier
        .padding(horizontal = 20.dp, vertical = 10.dp)
        .clip(RoundedCornerShape(10.dp))
        .background(Color.White)
        .fillMaxWidth()
        .padding(10.dp)
    ) {
        Column (
            verticalArrangement = Arrangement.SpaceAround,
            ) {
            Text(text = "Payment Options",
                style= MaterialTheme.typography.h3,
                modifier = Modifier.padding(bottom = 10.dp)
            )
            RadioGroup(
                radioOption = paymentMethod
            )
        }
    }
}

@Composable
fun RadioGroup(
    radioOption : List<PaymentMethod> = listOf(),
) {
    if (radioOption.isNotEmpty()) {
        val (selectedOption,onOptionSelected) = remember {
            mutableStateOf(radioOption[0])
        }
        Column (verticalArrangement = Arrangement.SpaceAround) {
            radioOption.forEach { item ->
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                        .border(1.dp, whiteGrey)
                        .padding(10.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = (item == selectedOption),
                            onClick = {onOptionSelected(item)}
                        )
                        val options = buildAnnotatedString {
                            append(" ${item.method}")
                        }
                        ClickableText(
                            text = options,
                            style= MaterialTheme.typography.body1,
                            onClick = { onOptionSelected(item) }
                        )
                    }
                    Image(
                        painter = painterResource(id = item.pic),
                        contentDescription = item.method,
                        modifier = Modifier
                            .size(50.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ConfirmButton() {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults
            .buttonColors(backgroundColor = orange1),
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .fillMaxWidth()
            .padding(10.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Column(
            horizontalAlignment= Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Pay & Confirm",
                style = MaterialTheme.typography.button
            )
        }
    }
}

@ExperimentalFoundationApi
@Preview
@Composable
fun IconPreview() {
    AppointmentScreen()
}