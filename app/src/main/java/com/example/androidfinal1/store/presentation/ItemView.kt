package com.example.androidfinal1.store.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.androidfinal1.store.data.Movie
import com.example.androidfinal1.store.data.remote.Movie

@Composable
fun ItemView(
    movie: Movie
    //isLastItem: Boolean,
) {
    Box() {
        Column {
            movie.posterUrl?.let { posterUrl ->
                Box(
                    modifier = Modifier
                        .size(width = 130.dp, height = 194.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .clickable { /* action */ }

                ) {
                    Image(
                        painter = rememberImagePainter(data = posterUrl),
                        contentDescription = "Movie Poster",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.matchParentSize()
                    )
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(8.dp)
                            .size(width = 24.dp, height = 16.dp)
                            .background(
                                Color.Blue,
                                RoundedCornerShape(4.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = movie.rating?.toString() ?: "0.0",
                            fontSize = 9.sp,
                            color = Color.White,
                        )
                    }
                }

            }
            Text(
                text = movie.title ?: "",
                fontSize = 20.sp,
                color = Color.Black,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .width(130.dp)
                    .padding(top = 5.dp)

            )
            Text(
                text = movie.genres.joinToString { it.name },
                fontSize = 15.sp,
                color = Color.Gray,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .width(130.dp)

            )


        }

        // }

    }


}
