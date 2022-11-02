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

public val BulkGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1504f, 22.0f)
                curveTo(4.7404f, 22.0f, 4.4004f, 21.66f, 4.4004f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(4.4004f, 2.34f, 4.7404f, 2.0f, 5.1504f, 2.0f)
                curveTo(5.5604f, 2.0f, 5.9004f, 2.34f, 5.9004f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(5.9004f, 21.66f, 5.5604f, 22.0f, 5.1504f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0195f, 12.3301f)
                lineTo(16.7995f, 11.1101f)
                curveTo(16.5095f, 10.8601f, 16.3395f, 10.4901f, 16.3295f, 10.0801f)
                curveTo(16.3095f, 9.6301f, 16.4895f, 9.1801f, 16.8195f, 8.8501f)
                lineTo(18.0195f, 7.6501f)
                curveTo(19.0595f, 6.6101f, 19.4495f, 5.6101f, 19.1195f, 4.8201f)
                curveTo(18.7995f, 4.0401f, 17.8095f, 3.6101f, 16.3495f, 3.6101f)
                horizontalLineTo(5.1495f)
                curveTo(4.9395f, 3.6201f, 4.7695f, 3.7901f, 4.7695f, 4.0001f)
                verticalLineTo(16.0001f)
                curveTo(4.7695f, 16.2101f, 4.9395f, 16.3801f, 5.1495f, 16.3801f)
                horizontalLineTo(16.3495f)
                curveTo(17.7895f, 16.3801f, 18.7595f, 15.9401f, 19.0895f, 15.1501f)
                curveTo(19.4195f, 14.3501f, 19.0395f, 13.3601f, 18.0195f, 12.3301f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
