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

public val LinearGroup.`Book-saved`: ImageVector
    get() {
        if (`_book-saved` != null) {
            return `_book-saved`!!
        }
        `_book-saved` = Builder(name = "Book-saved", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 4.6699f)
                verticalLineTo(16.74f)
                curveTo(22.0f, 17.7f, 21.22f, 18.5999f, 20.26f, 18.7199f)
                lineTo(19.93f, 18.76f)
                curveTo(17.75f, 19.05f, 14.39f, 20.1599f, 12.47f, 21.2199f)
                curveTo(12.21f, 21.3699f, 11.78f, 21.3699f, 11.51f, 21.2199f)
                lineTo(11.47f, 21.2f)
                curveTo(9.55f, 20.15f, 6.2f, 19.05f, 4.03f, 18.76f)
                lineTo(3.74f, 18.7199f)
                curveTo(2.78f, 18.5999f, 2.0f, 17.7f, 2.0f, 16.74f)
                verticalLineTo(4.6599f)
                curveTo(2.0f, 3.4699f, 2.97f, 2.5699f, 4.16f, 2.6699f)
                curveTo(6.26f, 2.8399f, 9.44f, 3.9f, 11.22f, 5.01f)
                lineTo(11.47f, 5.1599f)
                curveTo(11.76f, 5.3399f, 12.24f, 5.3399f, 12.53f, 5.1599f)
                lineTo(12.7f, 5.05f)
                curveTo(13.33f, 4.6599f, 14.13f, 4.2699f, 15.0f, 3.9199f)
                verticalLineTo(8.0f)
                lineTo(17.0f, 6.6699f)
                lineTo(19.0f, 8.0f)
                verticalLineTo(2.78f)
                curveTo(19.27f, 2.73f, 19.53f, 2.6999f, 19.77f, 2.6799f)
                horizontalLineTo(19.83f)
                curveTo(21.02f, 2.58f, 22.0f, 3.4699f, 22.0f, 4.6699f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.49f)
                verticalLineTo(20.49f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 2.78f)
                verticalLineTo(8.0f)
                lineTo(17.0f, 6.67f)
                lineTo(15.0f, 8.0f)
                verticalLineTo(3.92f)
                curveTo(16.31f, 3.4f, 17.77f, 2.98f, 19.0f, 2.78f)
                close()
            }
        }
        .build()
        return `_book-saved`!!
    }

private var `_book-saved`: ImageVector? = null
