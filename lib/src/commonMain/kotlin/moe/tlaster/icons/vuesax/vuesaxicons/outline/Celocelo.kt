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

public val OutlineGroup.Celocelo: ImageVector
    get() {
        if (_celocelo != null) {
            return _celocelo!!
        }
        _celocelo = Builder(name = "Celocelo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 16.75f)
                curveTo(10.73f, 16.75f, 7.25f, 13.27f, 7.25f, 9.0f)
                curveTo(7.25f, 4.73f, 10.73f, 1.25f, 15.0f, 1.25f)
                curveTo(19.27f, 1.25f, 22.75f, 4.73f, 22.75f, 9.0f)
                curveTo(22.75f, 13.27f, 19.27f, 16.75f, 15.0f, 16.75f)
                close()
                moveTo(15.0f, 2.75f)
                curveTo(11.55f, 2.75f, 8.75f, 5.55f, 8.75f, 9.0f)
                curveTo(8.75f, 12.45f, 11.55f, 15.25f, 15.0f, 15.25f)
                curveTo(18.45f, 15.25f, 21.25f, 12.45f, 21.25f, 9.0f)
                curveTo(21.25f, 5.55f, 18.45f, 2.75f, 15.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.75f)
                curveTo(4.73f, 22.75f, 1.25f, 19.27f, 1.25f, 15.0f)
                curveTo(1.25f, 10.73f, 4.73f, 7.25f, 9.0f, 7.25f)
                curveTo(13.27f, 7.25f, 16.75f, 10.73f, 16.75f, 15.0f)
                curveTo(16.75f, 19.27f, 13.27f, 22.75f, 9.0f, 22.75f)
                close()
                moveTo(9.0f, 8.75f)
                curveTo(5.55f, 8.75f, 2.75f, 11.55f, 2.75f, 15.0f)
                curveTo(2.75f, 18.45f, 5.55f, 21.25f, 9.0f, 21.25f)
                curveTo(12.45f, 21.25f, 15.25f, 18.45f, 15.25f, 15.0f)
                curveTo(15.25f, 11.55f, 12.45f, 8.75f, 9.0f, 8.75f)
                close()
            }
        }
        .build()
        return _celocelo!!
    }

private var _celocelo: ImageVector? = null
