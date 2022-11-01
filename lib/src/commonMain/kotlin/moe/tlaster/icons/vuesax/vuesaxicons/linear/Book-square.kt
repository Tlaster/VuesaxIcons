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

public val LinearGroup.`Book-square`: ImageVector
    get() {
        if (`_book-square` != null) {
            return `_book-square`!!
        }
        `_book-square` = Builder(name = "Book-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3801f, 15.27f)
                verticalLineTo(7.58f)
                curveTo(18.3801f, 6.81f, 17.7601f, 6.25f, 17.0001f, 6.31f)
                horizontalLineTo(16.9601f)
                curveTo(15.6201f, 6.42f, 13.5901f, 7.11f, 12.4501f, 7.82f)
                lineTo(12.3401f, 7.89f)
                curveTo(12.1601f, 8.0f, 11.8501f, 8.0f, 11.6601f, 7.89f)
                lineTo(11.5001f, 7.79f)
                curveTo(10.3701f, 7.08f, 8.3401f, 6.41f, 7.0001f, 6.3f)
                curveTo(6.2401f, 6.24f, 5.6201f, 6.81f, 5.6201f, 7.57f)
                verticalLineTo(15.27f)
                curveTo(5.6201f, 15.88f, 6.1201f, 16.46f, 6.7301f, 16.53f)
                lineTo(6.9101f, 16.56f)
                curveTo(8.2901f, 16.74f, 10.4301f, 17.45f, 11.6501f, 18.12f)
                lineTo(11.6801f, 18.13f)
                curveTo(11.8501f, 18.23f, 12.1301f, 18.23f, 12.2901f, 18.13f)
                curveTo(13.5101f, 17.45f, 15.6601f, 16.75f, 17.0501f, 16.56f)
                lineTo(17.2601f, 16.53f)
                curveTo(17.8801f, 16.46f, 18.3801f, 15.89f, 18.3801f, 15.27f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.1001f)
                verticalLineTo(17.6601f)
            }
        }
        .build()
        return `_book-square`!!
    }

private var `_book-square`: ImageVector? = null
