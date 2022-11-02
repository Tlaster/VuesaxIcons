package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Arrowup1: ImageVector
    get() {
        if (_arrowup1 != null) {
            return _arrowup1!!
        }
        _arrowup1 = Builder(name = "Arrowup1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12.0f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.25f)
                curveTo(11.59f, 16.25f, 11.25f, 15.91f, 11.25f, 15.5f)
                verticalLineTo(9.5f)
                curveTo(11.25f, 9.09f, 11.59f, 8.75f, 12.0f, 8.75f)
                curveTo(12.41f, 8.75f, 12.75f, 9.09f, 12.75f, 9.5f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.91f, 12.41f, 16.25f, 12.0f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9995f, 12.2499f)
                curveTo(14.8095f, 12.2499f, 14.6195f, 12.1799f, 14.4695f, 12.0299f)
                lineTo(11.9995f, 9.5599f)
                lineTo(9.5295f, 12.0299f)
                curveTo(9.2395f, 12.3199f, 8.7594f, 12.3199f, 8.4694f, 12.0299f)
                curveTo(8.1795f, 11.7399f, 8.1795f, 11.2599f, 8.4694f, 10.9699f)
                lineTo(11.4695f, 7.9699f)
                curveTo(11.7595f, 7.6799f, 12.2395f, 7.6799f, 12.5295f, 7.9699f)
                lineTo(15.5295f, 10.9699f)
                curveTo(15.8195f, 11.2599f, 15.8195f, 11.7399f, 15.5295f, 12.0299f)
                curveTo(15.3795f, 12.1799f, 15.1895f, 12.2499f, 14.9995f, 12.2499f)
                close()
            }
        }
        .build()
        return _arrowup1!!
    }

private var _arrowup1: ImageVector? = null
