package moe.tlaster.icons.vuesax.vuesaxicons.crypto.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.OutlineGroup

public val OutlineGroup.Dai: ImageVector
    get() {
        if (_dai != null) {
            return _dai!!
        }
        _dai = Builder(name = "Dai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 17.75f, 7.25f, 17.41f, 7.25f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(7.25f, 6.59f, 7.59f, 6.25f, 8.0f, 6.25f)
                horizontalLineTo(12.0f)
                curveTo(15.17f, 6.25f, 17.75f, 8.83f, 17.75f, 12.0f)
                curveTo(17.75f, 15.17f, 15.17f, 17.75f, 12.0f, 17.75f)
                close()
                moveTo(8.75f, 16.25f)
                horizontalLineTo(12.0f)
                curveTo(14.34f, 16.25f, 16.25f, 14.34f, 16.25f, 12.0f)
                curveTo(16.25f, 9.66f, 14.34f, 7.75f, 12.0f, 7.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5205f, 10.75f)
                horizontalLineTo(6.4805f)
                curveTo(6.0705f, 10.75f, 5.7305f, 10.41f, 5.7305f, 10.0f)
                curveTo(5.7305f, 9.59f, 6.0705f, 9.25f, 6.4805f, 9.25f)
                horizontalLineTo(18.5205f)
                curveTo(18.9305f, 9.25f, 19.2705f, 9.59f, 19.2705f, 10.0f)
                curveTo(19.2705f, 10.41f, 18.9305f, 10.75f, 18.5205f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5205f, 14.75f)
                horizontalLineTo(6.4805f)
                curveTo(6.0705f, 14.75f, 5.7305f, 14.41f, 5.7305f, 14.0f)
                curveTo(5.7305f, 13.59f, 6.0705f, 13.25f, 6.4805f, 13.25f)
                horizontalLineTo(18.5205f)
                curveTo(18.9305f, 13.25f, 19.2705f, 13.59f, 19.2705f, 14.0f)
                curveTo(19.2705f, 14.41f, 18.9305f, 14.75f, 18.5205f, 14.75f)
                close()
            }
        }
        .build()
        return _dai!!
    }

private var _dai: ImageVector? = null
