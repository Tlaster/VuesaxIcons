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

public val OutlineGroup.Arrowdown: ImageVector
    get() {
        if (_arrowdown != null) {
            return _arrowdown!!
        }
        _arrowdown = Builder(name = "Arrowdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9991f, 21.2501f)
                curveTo(11.8091f, 21.2501f, 11.6191f, 21.1801f, 11.4691f, 21.0301f)
                lineTo(5.3991f, 14.9601f)
                curveTo(5.1091f, 14.6701f, 5.1091f, 14.1901f, 5.3991f, 13.9001f)
                curveTo(5.6891f, 13.6101f, 6.1691f, 13.6101f, 6.4591f, 13.9001f)
                lineTo(11.9991f, 19.4401f)
                lineTo(17.5391f, 13.9001f)
                curveTo(17.8291f, 13.6101f, 18.3091f, 13.6101f, 18.5991f, 13.9001f)
                curveTo(18.8891f, 14.1901f, 18.8891f, 14.6701f, 18.5991f, 14.9601f)
                lineTo(12.5291f, 21.0301f)
                curveTo(12.3791f, 21.1801f, 12.1891f, 21.2501f, 11.9991f, 21.2501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.08f)
                curveTo(11.59f, 21.08f, 11.25f, 20.74f, 11.25f, 20.33f)
                verticalLineTo(3.5f)
                curveTo(11.25f, 3.09f, 11.59f, 2.75f, 12.0f, 2.75f)
                curveTo(12.41f, 2.75f, 12.75f, 3.09f, 12.75f, 3.5f)
                verticalLineTo(20.33f)
                curveTo(12.75f, 20.74f, 12.41f, 21.08f, 12.0f, 21.08f)
                close()
            }
        }
        .build()
        return _arrowdown!!
    }

private var _arrowdown: ImageVector? = null
