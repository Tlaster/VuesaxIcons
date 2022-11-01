package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Celo: ImageVector
    get() {
        if (_celo != null) {
            return _celo!!
        }
        _celo = Builder(name = "Celo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                curveTo(12.866f, 22.0f, 16.0f, 18.866f, 16.0f, 15.0f)
                curveTo(16.0f, 11.134f, 12.866f, 8.0f, 9.0f, 8.0f)
                curveTo(5.134f, 8.0f, 2.0f, 11.134f, 2.0f, 15.0f)
                curveTo(2.0f, 18.866f, 5.134f, 22.0f, 9.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9998f, 9.0f)
                curveTo(21.9998f, 11.74f, 20.4299f, 14.11f, 18.1399f, 15.25f)
                curveTo(17.8299f, 15.41f, 17.4798f, 15.16f, 17.4498f, 14.82f)
                curveTo(17.1098f, 10.37f, 13.5998f, 6.89f, 9.1798f, 6.55f)
                curveTo(8.8298f, 6.52f, 8.5898f, 6.17f, 8.7498f, 5.86f)
                curveTo(9.8898f, 3.57f, 12.2598f, 2.0f, 14.9998f, 2.0f)
                curveTo(18.8698f, 2.0f, 21.9998f, 5.13f, 21.9998f, 9.0f)
                close()
            }
        }
        .build()
        return _celo!!
    }

private var _celo: ImageVector? = null
