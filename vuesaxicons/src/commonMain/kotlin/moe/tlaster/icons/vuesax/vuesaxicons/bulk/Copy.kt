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

public val BulkGroup.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.9f)
                verticalLineTo(17.1f)
                curveTo(16.0f, 20.6f, 14.6f, 22.0f, 11.1f, 22.0f)
                horizontalLineTo(6.9f)
                curveTo(3.4f, 22.0f, 2.0f, 20.6f, 2.0f, 17.1f)
                verticalLineTo(12.9f)
                curveTo(2.0f, 9.4f, 3.4f, 8.0f, 6.9f, 8.0f)
                horizontalLineTo(11.1f)
                curveTo(14.6f, 8.0f, 16.0f, 9.4f, 16.0f, 12.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0998f, 2.0f)
                horizontalLineTo(12.8998f)
                curveTo(9.4498f, 2.0f, 8.0498f, 3.37f, 8.0098f, 6.75f)
                horizontalLineTo(11.0998f)
                curveTo(15.2998f, 6.75f, 17.2498f, 8.7f, 17.2498f, 12.9f)
                verticalLineTo(15.99f)
                curveTo(20.6298f, 15.95f, 21.9998f, 14.55f, 21.9998f, 11.1f)
                verticalLineTo(6.9f)
                curveTo(21.9998f, 3.4f, 20.5998f, 2.0f, 17.0998f, 2.0f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
