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

public val OutlineGroup.Arrowup3: ImageVector
    get() {
        if (_arrowup3 != null) {
            return _arrowup3!!
        }
        _arrowup3 = Builder(name = "Arrowup3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0691f, 10.3199f)
                curveTo(17.8791f, 10.3199f, 17.6891f, 10.2499f, 17.5391f, 10.0999f)
                lineTo(11.9991f, 4.5599f)
                lineTo(6.4591f, 10.0999f)
                curveTo(6.1691f, 10.3899f, 5.6891f, 10.3899f, 5.3991f, 10.0999f)
                curveTo(5.1091f, 9.8099f, 5.1091f, 9.3299f, 5.3991f, 9.0399f)
                lineTo(11.4691f, 2.9699f)
                curveTo(11.7591f, 2.6799f, 12.2391f, 2.6799f, 12.5291f, 2.9699f)
                lineTo(18.5991f, 9.0399f)
                curveTo(18.8891f, 9.3299f, 18.8891f, 9.8099f, 18.5991f, 10.0999f)
                curveTo(18.4591f, 10.2499f, 18.2591f, 10.3199f, 18.0691f, 10.3199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.2499f)
                curveTo(11.59f, 21.2499f, 11.25f, 20.9099f, 11.25f, 20.4999f)
                verticalLineTo(3.6699f)
                curveTo(11.25f, 3.2599f, 11.59f, 2.9199f, 12.0f, 2.9199f)
                curveTo(12.41f, 2.9199f, 12.75f, 3.2599f, 12.75f, 3.6699f)
                verticalLineTo(20.4999f)
                curveTo(12.75f, 20.9099f, 12.41f, 21.2499f, 12.0f, 21.2499f)
                close()
            }
        }
        .build()
        return _arrowup3!!
    }

private var _arrowup3: ImageVector? = null
