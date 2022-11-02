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

public val OutlineGroup.Minuscirlce: ImageVector
    get() {
        if (_minuscirlce != null) {
            return _minuscirlce!!
        }
        _minuscirlce = Builder(name = "Minuscirlce", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9199f, 22.75f)
                curveTo(5.9999f, 22.75f, 1.1699f, 17.93f, 1.1699f, 12.0f)
                curveTo(1.1699f, 6.07f, 5.9999f, 1.25f, 11.9199f, 1.25f)
                curveTo(17.8399f, 1.25f, 22.6699f, 6.07f, 22.6699f, 12.0f)
                curveTo(22.6699f, 17.93f, 17.8499f, 22.75f, 11.9199f, 22.75f)
                close()
                moveTo(11.9199f, 2.75f)
                curveTo(6.8199f, 2.75f, 2.6699f, 6.9f, 2.6699f, 12.0f)
                curveTo(2.6699f, 17.1f, 6.8199f, 21.25f, 11.9199f, 21.25f)
                curveTo(17.0199f, 21.25f, 21.1699f, 17.1f, 21.1699f, 12.0f)
                curveTo(21.1699f, 6.9f, 17.0199f, 2.75f, 11.9199f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9199f, 12.75f)
                horizontalLineTo(7.9199f)
                curveTo(7.5099f, 12.75f, 7.1699f, 12.41f, 7.1699f, 12.0f)
                curveTo(7.1699f, 11.59f, 7.5099f, 11.25f, 7.9199f, 11.25f)
                horizontalLineTo(15.9199f)
                curveTo(16.3299f, 11.25f, 16.6699f, 11.59f, 16.6699f, 12.0f)
                curveTo(16.6699f, 12.41f, 16.3399f, 12.75f, 15.9199f, 12.75f)
                close()
            }
        }
        .build()
        return _minuscirlce!!
    }

private var _minuscirlce: ImageVector? = null
