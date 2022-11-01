package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Reserve: ImageVector
    get() {
        if (_reserve != null) {
            return _reserve!!
        }
        _reserve = Builder(name = "Reserve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9707f, 18.0f)
                verticalLineTo(19.0f)
                curveTo(21.9707f, 20.65f, 21.9707f, 22.0f, 18.9707f, 22.0f)
                horizontalLineTo(4.9707f)
                curveTo(1.9707f, 22.0f, 1.9707f, 20.65f, 1.9707f, 19.0f)
                verticalLineTo(18.0f)
                curveTo(1.9707f, 17.45f, 2.4207f, 17.0f, 2.9707f, 17.0f)
                horizontalLineTo(20.9707f)
                curveTo(21.5207f, 17.0f, 21.9707f, 17.45f, 21.9707f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4095f, 5.1798f)
                curveTo(14.4595f, 4.9798f, 14.4895f, 4.7898f, 14.4995f, 4.5798f)
                curveTo(14.5295f, 3.4198f, 13.8195f, 2.3998f, 12.6995f, 2.0998f)
                curveTo(11.0195f, 1.6398f, 9.4995f, 2.8998f, 9.4995f, 4.4998f)
                curveTo(9.4995f, 4.7398f, 9.5295f, 4.9598f, 9.5895f, 5.1798f)
                curveTo(5.9795f, 5.9498f, 3.2695f, 9.1598f, 3.2695f, 12.9998f)
                verticalLineTo(14.4998f)
                curveTo(3.2695f, 15.0498f, 3.7195f, 15.4998f, 4.2695f, 15.4998f)
                horizontalLineTo(19.7195f)
                curveTo(20.2695f, 15.4998f, 20.7195f, 15.0498f, 20.7195f, 14.4998f)
                verticalLineTo(12.9998f)
                curveTo(20.7195f, 9.1598f, 18.0195f, 5.9598f, 14.4095f, 5.1798f)
                close()
                moveTo(14.9995f, 11.7498f)
                horizontalLineTo(8.9995f)
                curveTo(8.5895f, 11.7498f, 8.2495f, 11.4098f, 8.2495f, 10.9998f)
                curveTo(8.2495f, 10.5898f, 8.5895f, 10.2498f, 8.9995f, 10.2498f)
                horizontalLineTo(14.9995f)
                curveTo(15.4095f, 10.2498f, 15.7495f, 10.5898f, 15.7495f, 10.9998f)
                curveTo(15.7495f, 11.4098f, 15.4095f, 11.7498f, 14.9995f, 11.7498f)
                close()
            }
        }
        .build()
        return _reserve!!
    }

private var _reserve: ImageVector? = null
