package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Booksquare: ImageVector
    get() {
        if (_booksquare != null) {
            return _booksquare!!
        }
        _booksquare = Builder(name = "Booksquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 13.02f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3792f, 15.27f)
                verticalLineTo(7.58f)
                curveTo(18.3792f, 6.81f, 17.7591f, 6.25f, 16.9991f, 6.31f)
                horizontalLineTo(16.9592f)
                curveTo(15.6192f, 6.42f, 13.5892f, 7.11f, 12.4492f, 7.82f)
                lineTo(12.3392f, 7.89f)
                curveTo(12.1592f, 8.0f, 11.8491f, 8.0f, 11.6591f, 7.89f)
                lineTo(11.4991f, 7.79f)
                curveTo(10.3691f, 7.08f, 8.3392f, 6.41f, 6.9991f, 6.3f)
                curveTo(6.2392f, 6.24f, 5.6191f, 6.81f, 5.6191f, 7.57f)
                verticalLineTo(15.27f)
                curveTo(5.6191f, 15.88f, 6.1191f, 16.46f, 6.7291f, 16.53f)
                lineTo(6.9091f, 16.56f)
                curveTo(8.2891f, 16.74f, 10.4292f, 17.45f, 11.6492f, 18.12f)
                lineTo(11.6791f, 18.13f)
                curveTo(11.8491f, 18.23f, 12.1291f, 18.23f, 12.2891f, 18.13f)
                curveTo(13.5091f, 17.45f, 15.6591f, 16.75f, 17.0491f, 16.56f)
                lineTo(17.2592f, 16.53f)
                curveTo(17.8792f, 16.46f, 18.3792f, 15.89f, 18.3792f, 15.27f)
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
        return _booksquare!!
    }

private var _booksquare: ImageVector? = null
