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

public val OutlineGroup.Toggleoncircle: ImageVector
    get() {
        if (_toggleoncircle != null) {
            return _toggleoncircle!!
        }
        _toggleoncircle = Builder(name = "Toggleoncircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 20.75f)
                horizontalLineTo(10.0f)
                curveTo(5.17f, 20.75f, 1.25f, 16.82f, 1.25f, 12.0f)
                curveTo(1.25f, 7.18f, 5.17f, 3.25f, 10.0f, 3.25f)
                horizontalLineTo(14.0f)
                curveTo(18.83f, 3.25f, 22.75f, 7.18f, 22.75f, 12.0f)
                curveTo(22.75f, 16.82f, 18.83f, 20.75f, 14.0f, 20.75f)
                close()
                moveTo(10.0f, 4.75f)
                curveTo(6.0f, 4.75f, 2.75f, 8.0f, 2.75f, 12.0f)
                curveTo(2.75f, 16.0f, 6.0f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(14.0f)
                curveTo(18.0f, 19.25f, 21.25f, 16.0f, 21.25f, 12.0f)
                curveTo(21.25f, 8.0f, 18.0f, 4.75f, 14.0f, 4.75f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.75f)
                curveTo(11.38f, 16.75f, 9.25f, 14.62f, 9.25f, 12.0f)
                curveTo(9.25f, 9.38f, 11.38f, 7.25f, 14.0f, 7.25f)
                curveTo(16.62f, 7.25f, 18.75f, 9.38f, 18.75f, 12.0f)
                curveTo(18.75f, 14.62f, 16.62f, 16.75f, 14.0f, 16.75f)
                close()
                moveTo(14.0f, 8.75f)
                curveTo(12.21f, 8.75f, 10.75f, 10.21f, 10.75f, 12.0f)
                curveTo(10.75f, 13.79f, 12.21f, 15.25f, 14.0f, 15.25f)
                curveTo(15.79f, 15.25f, 17.25f, 13.79f, 17.25f, 12.0f)
                curveTo(17.25f, 10.21f, 15.79f, 8.75f, 14.0f, 8.75f)
                close()
            }
        }
        .build()
        return _toggleoncircle!!
    }

private var _toggleoncircle: ImageVector? = null
