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

public val BulkGroup.Teacher: ImageVector
    get() {
        if (_teacher != null) {
            return _teacher!!
        }
        _teacher = Builder(name = "Teacher", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3791f, 12.8401f)
                verticalLineTo(17.7701f)
                curveTo(18.3791f, 19.0401f, 17.3891f, 20.4001f, 16.1991f, 20.8001f)
                lineTo(13.0091f, 21.8601f)
                curveTo(12.4491f, 22.0501f, 11.5391f, 22.0501f, 10.9891f, 21.8601f)
                lineTo(7.7991f, 20.8001f)
                curveTo(6.5991f, 20.4001f, 5.6191f, 19.0401f, 5.6191f, 17.7701f)
                lineTo(5.6291f, 12.8401f)
                lineTo(10.0491f, 15.7201f)
                curveTo(11.1291f, 16.4301f, 12.9091f, 16.4301f, 13.9891f, 15.7201f)
                lineTo(18.3791f, 12.8401f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9795f, 6.4601f)
                lineTo(13.9895f, 2.5301f)
                curveTo(12.9095f, 1.8201f, 11.1295f, 1.8201f, 10.0495f, 2.5301f)
                lineTo(4.0295f, 6.4601f)
                curveTo(2.0995f, 7.7101f, 2.0995f, 10.5401f, 4.0295f, 11.8001f)
                lineTo(5.6295f, 12.8401f)
                lineTo(10.0495f, 15.7201f)
                curveTo(11.1295f, 16.4301f, 12.9095f, 16.4301f, 13.9895f, 15.7201f)
                lineTo(18.3795f, 12.8401f)
                lineTo(19.7495f, 11.9401f)
                verticalLineTo(15.0001f)
                curveTo(19.7495f, 15.4101f, 20.0895f, 15.7501f, 20.4995f, 15.7501f)
                curveTo(20.9095f, 15.7501f, 21.2495f, 15.4101f, 21.2495f, 15.0001f)
                verticalLineTo(10.0801f)
                curveTo(21.6495f, 8.7901f, 21.2395f, 7.2901f, 19.9795f, 6.4601f)
                close()
            }
        }
        .build()
        return _teacher!!
    }

private var _teacher: ImageVector? = null
