
CardWidget(
namaRes = R.string.nama1,
telpRes = null,
alamatRes = R.string.alamat1,
bgColorRes = R.color.card_brown
)

Spacer(modifier = Modifier.height(12.dp))

CardWidget(
namaRes = R.string.nama2,
telpRes = R.string.telp2,
alamatRes = R.string.alamat2,
bgColorRes = R.color.card_purple
)

Spacer(modifier = Modifier.height(12.dp))

CardWidget(
namaRes = R.string.nama3,
telpRes = R.string.telp3,
alamatRes = R.string.alamat3,
bgColorRes = R.color.card_blue
)

Spacer(modifier = Modifier.height(12.dp))

CardWidget(
namaRes = R.string.nama4,
telpRes = R.string.telp4,
alamatRes = R.string.alamat4,
bgColorRes = R.color.card_green
)

Spacer(modifier = Modifier.weight(1f))

// Commit 19: feat: atur posisi teks footer copyright
Text(
text = stringResource(id = R.string.copy),
fontSize = 12.sp,
color = colorResource(id = R.color.black),
modifier = Modifier.padding(bottom = 8.dp)
)
}
}


