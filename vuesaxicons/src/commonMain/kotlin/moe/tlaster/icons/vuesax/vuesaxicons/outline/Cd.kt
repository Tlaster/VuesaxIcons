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

public val OutlineGroup.Cd: ImageVector
    get() {
        if (_cd != null) {
            return _cd!!
        }
        _cd = Builder(name = "Cd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 14.75f)
                curveTo(10.48f, 14.75f, 9.25f, 13.52f, 9.25f, 12.0f)
                curveTo(9.25f, 10.48f, 10.48f, 9.25f, 12.0f, 9.25f)
                curveTo(13.52f, 9.25f, 14.75f, 10.48f, 14.75f, 12.0f)
                curveTo(14.75f, 13.52f, 13.52f, 14.75f, 12.0f, 14.75f)
                close()
                moveTo(12.0f, 10.75f)
                curveTo(11.31f, 10.75f, 10.75f, 11.31f, 10.75f, 12.0f)
                curveTo(10.75f, 12.69f, 11.31f, 13.25f, 12.0f, 13.25f)
                curveTo(12.69f, 13.25f, 13.25f, 12.69f, 13.25f, 12.0f)
                curveTo(13.25f, 11.31f, 12.69f, 10.75f, 12.0f, 10.75f)
                close()
            }
        }
        .build()
        return _cd!!
    }

private var _cd: ImageVector? = null
