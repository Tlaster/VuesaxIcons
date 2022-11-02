package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val BulkGroup.Pet: ImageVector
    get() {
        if (_pet != null) {
            return _pet!!
        }
        _pet = Builder(name = "Pet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0803f, 15.7201f)
                curveTo(18.4903f, 12.1901f, 15.1003f, 9.3201f, 11.5203f, 9.3201f)
                curveTo(7.6303f, 9.3201f, 4.2103f, 12.4701f, 3.8803f, 16.3501f)
                curveTo(3.7503f, 17.8501f, 4.2303f, 19.2701f, 5.2203f, 20.3401f)
                curveTo(6.2003f, 21.4101f, 7.5803f, 22.0001f, 9.0803f, 22.0001f)
                horizontalLineTo(13.7603f)
                curveTo(15.4503f, 22.0001f, 16.9303f, 21.3401f, 17.9403f, 20.1501f)
                curveTo(18.9503f, 18.9601f, 19.3503f, 17.3801f, 19.0803f, 15.7201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2796f, 7.86f)
                curveTo(11.8978f, 7.86f, 13.2096f, 6.5482f, 13.2096f, 4.93f)
                curveTo(13.2096f, 3.3118f, 11.8978f, 2.0f, 10.2796f, 2.0f)
                curveTo(8.6614f, 2.0f, 7.3496f, 3.3118f, 7.3496f, 4.93f)
                curveTo(7.3496f, 6.5482f, 8.6614f, 7.86f, 10.2796f, 7.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.94f, 9.0299f)
                curveTo(18.2876f, 9.0299f, 19.38f, 7.9375f, 19.38f, 6.5899f)
                curveTo(19.38f, 5.2423f, 18.2876f, 4.1499f, 16.94f, 4.1499f)
                curveTo(15.5924f, 4.1499f, 14.5f, 5.2423f, 14.5f, 6.5899f)
                curveTo(14.5f, 7.9375f, 15.5924f, 9.0299f, 16.94f, 9.0299f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5496f, 12.93f)
                curveTo(21.6266f, 12.93f, 22.4996f, 12.057f, 22.4996f, 10.98f)
                curveTo(22.4996f, 9.9031f, 21.6266f, 9.03f, 20.5496f, 9.03f)
                curveTo(19.4727f, 9.03f, 18.5996f, 9.9031f, 18.5996f, 10.98f)
                curveTo(18.5996f, 12.057f, 19.4727f, 12.93f, 20.5496f, 12.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.94f, 10.9801f)
                curveTo(5.2876f, 10.9801f, 6.38f, 9.8877f, 6.38f, 8.5401f)
                curveTo(6.38f, 7.1925f, 5.2876f, 6.1001f, 3.94f, 6.1001f)
                curveTo(2.5924f, 6.1001f, 1.5f, 7.1925f, 1.5f, 8.5401f)
                curveTo(1.5f, 9.8877f, 2.5924f, 10.9801f, 3.94f, 10.9801f)
                close()
            }
        }
        .build()
        return _pet!!
    }

private var _pet: ImageVector? = null
