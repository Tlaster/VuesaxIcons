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

public val OutlineGroup.Mirror: ImageVector
    get() {
        if (_mirror != null) {
            return _mirror!!
        }
        _mirror = Builder(name = "Mirror", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.75f)
                curveTo(7.17f, 18.75f, 3.25f, 14.82f, 3.25f, 10.0f)
                curveTo(3.25f, 5.18f, 7.17f, 1.25f, 12.0f, 1.25f)
                curveTo(16.83f, 1.25f, 20.75f, 5.18f, 20.75f, 10.0f)
                curveTo(20.75f, 14.82f, 16.83f, 18.75f, 12.0f, 18.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(8.0f, 2.75f, 4.75f, 6.0f, 4.75f, 10.0f)
                curveTo(4.75f, 14.0f, 8.0f, 17.25f, 12.0f, 17.25f)
                curveTo(16.0f, 17.25f, 19.25f, 14.0f, 19.25f, 10.0f)
                curveTo(19.25f, 6.0f, 16.0f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 22.75f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 22.75f, 5.25f, 22.41f, 5.25f, 22.0f)
                curveTo(5.25f, 21.59f, 5.59f, 21.25f, 6.0f, 21.25f)
                horizontalLineTo(18.0f)
                curveTo(18.41f, 21.25f, 18.75f, 21.59f, 18.75f, 22.0f)
                curveTo(18.75f, 22.41f, 18.41f, 22.75f, 18.0f, 22.75f)
                close()
            }
        }
        .build()
        return _mirror!!
    }

private var _mirror: ImageVector? = null
