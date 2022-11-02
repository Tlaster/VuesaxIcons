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

public val OutlineGroup.Export: ImageVector
    get() {
        if (_export != null) {
            return _export!!
        }
        _export = Builder(name = "Export", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4398f, 7.2499f)
                curveTo(14.2498f, 7.2499f, 14.0598f, 7.1799f, 13.9098f, 7.0299f)
                lineTo(11.8798f, 4.9999f)
                lineTo(9.8498f, 7.0299f)
                curveTo(9.5598f, 7.3199f, 9.0798f, 7.3199f, 8.7898f, 7.0299f)
                curveTo(8.4998f, 6.7399f, 8.4998f, 6.2599f, 8.7898f, 5.9699f)
                lineTo(11.3498f, 3.4099f)
                curveTo(11.6398f, 3.1199f, 12.1198f, 3.1199f, 12.4098f, 3.4099f)
                lineTo(14.9698f, 5.9699f)
                curveTo(15.2598f, 6.2599f, 15.2598f, 6.7399f, 14.9698f, 7.0299f)
                curveTo(14.8198f, 7.1799f, 14.6298f, 7.2499f, 14.4398f, 7.2499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8809f, 14.93f)
                curveTo(11.4709f, 14.93f, 11.1309f, 14.59f, 11.1309f, 14.18f)
                verticalLineTo(4.01f)
                curveTo(11.1309f, 3.6f, 11.4709f, 3.26f, 11.8809f, 3.26f)
                curveTo(12.2909f, 3.26f, 12.6309f, 3.6f, 12.6309f, 4.01f)
                verticalLineTo(14.18f)
                curveTo(12.6309f, 14.6f, 12.2909f, 14.93f, 11.8809f, 14.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.75f)
                curveTo(6.85f, 20.75f, 3.25f, 17.15f, 3.25f, 12.0f)
                curveTo(3.25f, 11.59f, 3.59f, 11.25f, 4.0f, 11.25f)
                curveTo(4.41f, 11.25f, 4.75f, 11.59f, 4.75f, 12.0f)
                curveTo(4.75f, 16.27f, 7.73f, 19.25f, 12.0f, 19.25f)
                curveTo(16.27f, 19.25f, 19.25f, 16.27f, 19.25f, 12.0f)
                curveTo(19.25f, 11.59f, 19.59f, 11.25f, 20.0f, 11.25f)
                curveTo(20.41f, 11.25f, 20.75f, 11.59f, 20.75f, 12.0f)
                curveTo(20.75f, 17.15f, 17.15f, 20.75f, 12.0f, 20.75f)
                close()
            }
        }
        .build()
        return _export!!
    }

private var _export: ImageVector? = null
