Column(
horizontalAlignment = Alignment.CenterHorizontally,
modifier = Modifier
.weight(1f)
.padding(horizontal = 8.dp)
) {
    Text(
        text = stringResource(id = namaRes),
        color = colorResource(id = R.color.white),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )

    if (telpRes != null) {
        Text(
            text = stringResource(id = telpRes),
            color = colorResource(id = R.color.white),
            fontSize = 12.sp
        )
    }

    Text(
        text = stringResource(id = alamatRes),
        color = colorResource(id = R.color.white),
        fontSize = 12.sp
    )
}
