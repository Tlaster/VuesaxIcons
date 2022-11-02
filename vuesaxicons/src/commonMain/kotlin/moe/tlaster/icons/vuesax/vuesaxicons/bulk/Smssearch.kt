package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Smssearch: ImageVector
    get() {
        if (_smssearch != null) {
            return _smssearch!!
        }
        _smssearch = Builder(name = "Smssearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 20.5f, 2.0f, 19.0f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 5.0f, 4.0f, 3.5f, 7.0f, 3.5f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 3.5f, 22.0f, 5.0f, 22.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22.0f, 19.0f, 20.0f, 20.5f, 17.0f, 20.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.586f, 8.532f)
                curveTo(17.8445f, 8.8556f, 17.7917f, 9.3275f, 17.4681f, 9.5861f)
                lineTo(14.3372f, 12.0868f)
                curveTo(13.0338f, 13.1244f, 10.9563f, 13.1244f, 9.6529f, 12.0868f)
                lineTo(9.651f, 12.0853f)
                lineTo(6.5311f, 9.5853f)
                curveTo(6.2078f, 9.3263f, 6.1557f, 8.8543f, 6.4147f, 8.531f)
                curveTo(6.6737f, 8.2078f, 7.1458f, 8.1557f, 7.469f, 8.4147f)
                lineTo(10.588f, 10.914f)
                curveTo(11.3446f, 11.5155f, 12.6462f, 11.5154f, 13.4025f, 10.9135f)
                curveTo(13.4027f, 10.9135f, 13.4024f, 10.9136f, 13.4025f, 10.9135f)
                lineTo(16.532f, 8.414f)
                curveTo(16.8556f, 8.1555f, 17.3275f, 8.2083f, 17.586f, 8.532f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.6609f, 21.47f)
                lineTo(21.9209f, 20.73f)
                curveTo(22.3009f, 20.15f, 22.5309f, 19.45f, 22.5309f, 18.7f)
                curveTo(22.5309f, 16.66f, 20.8708f, 15.0f, 18.8308f, 15.0f)
                curveTo(16.7908f, 15.0f, 15.1309f, 16.66f, 15.1309f, 18.7f)
                curveTo(15.1309f, 20.74f, 16.7908f, 22.4f, 18.8308f, 22.4f)
                curveTo(19.5808f, 22.4f, 20.2808f, 22.17f, 20.8608f, 21.79f)
                lineTo(21.6009f, 22.53f)
                curveTo(21.7509f, 22.68f, 21.9409f, 22.75f, 22.1309f, 22.75f)
                curveTo(22.3209f, 22.75f, 22.5109f, 22.68f, 22.6609f, 22.53f)
                curveTo(22.9509f, 22.24f, 22.9509f, 21.76f, 22.6609f, 21.47f)
                close()
            }
        }
        .build()
        return _smssearch!!
    }

private var _smssearch: ImageVector? = null
