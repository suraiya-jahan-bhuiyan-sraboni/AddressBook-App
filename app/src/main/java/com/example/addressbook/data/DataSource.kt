package com.example.addressbook.data

import com.example.addressbook.R.*
import com.example.addressbook.model.User


class DataSource {
    fun loadData(): List<User> {
        return listOf(
            User(
                drawable.image1,
                string.a,
                string.a1,
                string.v1,
                string.p1,
                string.di1,
                string.dv1,
                string.cn1
            ),
            User(
                drawable.image2,
                string.b,
                string.b1,
                string.v2,
                string.p2,
                string.di2,
                string.dv2,
                string.cn2
            ),
            User(
                drawable.image3,
                string.c,
                string.c1,
                string.v3,
                string.p3,
                string.di3,
                string.dv3,
                string.cn3
            ),
            User(
                drawable.image4,
                string.d,
                string.d1,
                string.v4,
                string.p4,
                string.di4,
                string.dv4,
                string.cn4
            ),
            User(
                drawable.image5,
                string.e,
                string.e1,
                string.v5,
                string.p5,
                string.di5,
                string.dv5,
                string.cn5
            ),
            User(
                drawable.image6,
                string.f,
                string.f1,
                string.v6,
                string.p6,
                string.di6,
                string.dv6,
                string.cn6
            ),
            User(
                drawable.image7,
                string.g,
                string.g1,
                string.v7,
                string.p7,
                string.di7,
                string.dv7,
                string.cn7
            ),
            User(
                drawable.image8,
                string.h,
                string.h1,
                string.v8,
                string.p8,
                string.di8,
                string.dv8,
                string.cn8
            ),
            User(
                drawable.image9,
                string.i,
                string.i1,
                string.v9,
                string.p9,
                string.di9,
                string.dv9,
                string.cn9
            ),
            User(
                drawable.image10,
                string.j,
                string.j1,
                string.v10,
                string.p10,
                string.di10,
                string.dv10,
                string.cn10
            )
        )
    }
}