package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Tag-user`: ImageVector
    get() {
        if (`_tag-user` != null) {
            return `_tag-user`!!
        }
        `_tag-user` = Builder(name = "Tag-user", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.86f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.86f, 15.68f, 19.17f, 15.12f, 19.73f)
                lineTo(13.41f, 21.42f)
                curveTo(12.63f, 22.19f, 11.36f, 22.19f, 10.58f, 21.42f)
                lineTo(8.87f, 19.73f)
                curveTo(8.31f, 19.17f, 7.54f, 18.86f, 6.75f, 18.86f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 18.86f, 3.0f, 17.53f, 3.0f, 15.89f)
                verticalLineTo(4.97f)
                curveTo(3.0f, 3.33f, 4.34f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 2.0f, 21.0f, 3.33f, 21.0f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(21.0f, 17.52f, 19.66f, 18.86f, 18.0f, 18.86f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0699f, 8.9501f)
                curveTo(12.0299f, 8.9501f, 11.9699f, 8.9501f, 11.9199f, 8.9501f)
                curveTo(10.8699f, 8.9101f, 10.0399f, 8.0601f, 10.0399f, 7.0001f)
                curveTo(10.0399f, 5.9201f, 10.9099f, 5.05f, 11.9899f, 5.05f)
                curveTo(13.0699f, 5.05f, 13.9399f, 5.93f, 13.9399f, 7.0001f)
                curveTo(13.9499f, 8.0601f, 13.1199f, 8.92f, 12.0699f, 8.9501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.2499f, 11.9601f)
                curveTo(7.9199f, 12.8501f, 7.9199f, 14.3001f, 9.2499f, 15.1901f)
                curveTo(10.7599f, 16.2001f, 13.2399f, 16.2001f, 14.7499f, 15.1901f)
                curveTo(16.0799f, 14.3001f, 16.0799f, 12.8501f, 14.7499f, 11.9601f)
                curveTo(13.2399f, 10.9601f, 10.7699f, 10.9601f, 9.2499f, 11.9601f)
                close()
            }
        }
        .build()
        return `_tag-user`!!
    }

private var `_tag-user`: ImageVector? = null
